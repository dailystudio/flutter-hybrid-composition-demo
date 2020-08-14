package com.dailystudio.flutter.hybridcomp

import android.content.Context
import android.graphics.Color
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.annotation.Nullable
import io.flutter.plugin.platform.PlatformView


class NativeView(context: Context, id: Int,
                 @Nullable creationParams: Map<String?, Any?>?) : PlatformView {

    private val textView: TextView

    override fun getView(): View {
        return textView
    }

    override fun dispose() {}

    init {
        textView = EditText(context)
        textView.textSize = 72f
        textView.setBackgroundColor(Color.rgb(255, 255, 255))
//        textView.text = "Rendered on a native Android view (id: $id)"
    }

}