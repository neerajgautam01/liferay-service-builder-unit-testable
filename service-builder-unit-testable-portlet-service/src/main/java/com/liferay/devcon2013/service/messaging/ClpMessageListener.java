package com.liferay.devcon2013.service.messaging;

import com.liferay.devcon2013.service.BeerDrinkerLocalServiceUtil;
import com.liferay.devcon2013.service.BeerDrinkerServiceUtil;
import com.liferay.devcon2013.service.ClpSerializer;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            BeerDrinkerLocalServiceUtil.clearService();

            BeerDrinkerServiceUtil.clearService();
        }
    }
}
