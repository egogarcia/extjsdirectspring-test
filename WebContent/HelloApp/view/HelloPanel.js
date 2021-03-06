/*
 * File: HelloApp/view/HelloPanel.js
 *
 * This file was generated by Sencha Architect version 2.1.0.
 * http://www.sencha.com/products/architect/
 *
 * This file requires use of the Ext JS 4.1.x library, under independent license.
 * License of Sencha Architect does not include license for Ext JS 4.1.x. For more
 * details see http://www.sencha.com/license or contact license@sencha.com.
 *
 * This file will be auto-generated each and everytime you save your project.
 *
 * Do NOT hand edit this file.
 */

Ext.define('MyApp.view.HelloPanel', {
    extend: 'Ext.panel.Panel',

    height: 84,
    width: 540,
    layout: {
        align: 'center',
        type: 'vbox'
    },
    itemId: 'HelloPanel',
    id: 'HelloPanel',
    title: 'Hola',

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'textfield',
                    itemId: 'NameTextField',
                    fieldLabel: 'Introduce tu nombre'
                },
                {
                    xtype: 'button',
                    itemId: 'HelloButton',
                    text: 'Aceptar'
                }
            ]
        });

        me.callParent(arguments);
    }

});