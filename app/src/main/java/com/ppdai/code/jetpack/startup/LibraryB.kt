package com.ppdai.code.jetpack.startup

import android.content.Context
import android.util.Log

/**
 * @author sunshine big boy
 *
 * <pre>
 *      talk is cheap, show me the code
 * </pre>
 */
class LibraryB private constructor(private val context: Context) {

    companion object {

        lateinit var instance: LibraryB

        @JvmStatic
        fun getInstance(context: Context): LibraryB {
            if (!this::instance.isInitialized) {
                instance = LibraryB(context)
            }
            Log.d("adai", "LibraryB")
            return instance
        }

    }

    fun test() {
        Log.d("adai", "LibraryB.test()")
    }

}