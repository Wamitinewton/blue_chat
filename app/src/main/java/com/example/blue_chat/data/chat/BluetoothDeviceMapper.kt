package com.example.blue_chat.data.chat

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import com.example.blue_chat.domain.chat.BluetoothDeviceDomain

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceDomain{
    return BluetoothDeviceDomain(
        name = name,
        address = address
    )
}