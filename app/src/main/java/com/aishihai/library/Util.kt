package com.aishihai.library

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup

@Suppress("unused")
class Util {
    fun getText(context:Context):String {
        return context.resources.getString(R.string.library_string)
    }

    fun addTextView(context: Context, activity: Activity, id: Int) {
        val view = activity.findViewById<ViewGroup>(id)
        val inflater = LayoutInflater.from(context)
        inflater.inflate(R.layout.just_text_view, view)
    }

    fun startActivity(libraryContext:Context, accessApkContext:Context) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(libraryContext.getString(R.string.google_url)))
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        accessApkContext.startActivity(intent)
    }
}