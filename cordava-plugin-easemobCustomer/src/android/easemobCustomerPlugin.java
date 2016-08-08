package com.zgsoft;

import android.content.Intent;

import com.easemob.customer.activity.ChatActivity;
import com.easemob.customer.entity.ZgKefuInfo;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaActivity;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Administrator on 2016-08-05.
 */
public class easemobCustomerPlugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        //return super.execute(action, args, callbackContext);
        //Log.d("easemob","be called "+action);

        PluginResult.Status status = PluginResult.Status.OK;
        String result = "";
        try {
            if (action.equals("callCustomer")) {
                CordovaActivity activity = (CordovaActivity)this.cordova.getActivity();
                //Toast.makeText(activity, "be called ", Toast.LENGTH_LONG).show();
                Intent i = activity.getIntent();
                JSONObject kfInfo = args.getJSONObject(0);
                //Log.d("easemob",kfInfo.toString());
                //Toast.makeText(activity, kfInfo.toString(), Toast.LENGTH_LONG).show();

                ChatActivity.startChat(activity,new ZgKefuInfo(kfInfo));
                callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, true));
                return true;
            }
            return false;
        } catch (JSONException e) {
            e.printStackTrace();
            callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.JSON_EXCEPTION));
            return true;
        }

    }

}
