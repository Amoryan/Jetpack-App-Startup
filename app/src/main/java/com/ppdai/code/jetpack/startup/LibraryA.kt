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
class LibraryA private constructor(private val context: Context) {

    companion object {

        lateinit var instance: LibraryA

        @JvmStatic
        fun getInstance(context: Context): LibraryA {
            if (!this::instance.isInitialized) {
                instance = LibraryA(context)
            }
            Log.d("adai", "LibraryA")
            return instance
        }
    }

    fun test() {
        Log.d("adai", "LibraryA.test()")
    }

}