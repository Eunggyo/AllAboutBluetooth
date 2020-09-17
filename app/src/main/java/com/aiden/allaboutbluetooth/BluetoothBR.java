package com.aiden.allaboutbluetooth;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BluetoothBR extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();

        switch (action) {
            case BluetoothDevice.ACTION_ACL_CONNECTED:

                break;

            case BluetoothDevice.ACTION_ACL_DISCONNECT_REQUESTED:

                break;

            case BluetoothDevice.ACTION_ACL_DISCONNECTED:

                break;

            case BluetoothDevice.ACTION_BOND_STATE_CHANGED:

                break;

            case BluetoothDevice.ACTION_CLASS_CHANGED:

                break;

            case BluetoothDevice.ACTION_FOUND:

                break;

            case BluetoothDevice.ACTION_NAME_CHANGED:

                break;

            case BluetoothDevice.ACTION_PAIRING_REQUEST:

                break;

            case BluetoothDevice.ACTION_UUID:

                break;

            case BluetoothDevice.EXTRA_BOND_STATE:

                break;

            case BluetoothAdapter.ACTION_CONNECTION_STATE_CHANGED:

                break;

            case BluetoothAdapter.ACTION_DISCOVERY_FINISHED:

                break;

            case BluetoothAdapter.ACTION_DISCOVERY_STARTED:

                break;

            case BluetoothAdapter.ACTION_LOCAL_NAME_CHANGED:

                break;

            case BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE:

                break;

            case BluetoothAdapter.ACTION_REQUEST_ENABLE:

                break;

            case BluetoothAdapter.ACTION_SCAN_MODE_CHANGED:

                break;

            case BluetoothAdapter.ACTION_STATE_CHANGED:

                break;

                case BluetoothProfile
                        .STATE_CONNECTED


        }

    }
}
