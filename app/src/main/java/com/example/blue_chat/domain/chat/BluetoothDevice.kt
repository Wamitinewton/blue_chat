package com.example.blue_chat.domain.chat

typealias BluetoothDeviceDomain = BluetoothDevice

data class BluetoothDevice(
    val name: String?,
    // value of mac address
    val address: String
)
