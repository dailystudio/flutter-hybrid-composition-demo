package com.dailystudio.flutter.hybridcomp

import android.content.Context
import android.view.View
import io.flutter.plugin.common.BinaryMessenger
import io.flutter.plugin.common.StandardMessageCodec
import io.flutter.plugin.platform.PlatformView
import io.flutter.plugin.platform.PlatformViewFactory


internal class NativeViewFactory : PlatformViewFactory(StandardMessageCodec.INSTANCE) {

    private lateinit var messenger: BinaryMessenger
    private lateinit var containerView: View

    fun NativeViewFactory(messenger: BinaryMessenger, containerView: View) {
        this.messenger = messenger
        this.containerView = containerView
    }

    override fun create(context: Context, id: Int, args: Any?): PlatformView {
        val creationParams = args as Map<String?, Any?>?
        return NativeView(context, id, creationParams)
    }

}