package com.example.contentproviderdemo

import android.content.ContentProvider
import android.content.ContentValues
import android.database.Cursor
import android.net.Uri

class MyContentProvider : ContentProvider() {

    override fun onCreate(): Boolean {
        /*
        * APP启动流程：
        * -> Application#attachBaseContext
        * -> ContentProvider#onCreate // 只需要在清单文件中声明，Provider就会自动执行。这个特性可以用来简化某些SDK的集成。
        *                                比如LeakCanary就只需要在构建脚本中声明就可以了，不需要添加修改任何代码就能工作。
        *                                原因就是LeakCanary声明了一个Provider，在Provider#onCreate里面完成了初始化工作。
        * -> Application#onCreate
        * -> Activity#onCreate
        * */
        println("MyContentProvider#onCreate")
        return true
    }

    override fun delete(uri: Uri, selection: String?, selectionArgs: Array<String>?): Int {
        TODO("Implement this to handle requests to delete one or more rows")
    }

    override fun getType(uri: Uri): String? {
        TODO(
            "Implement this to handle requests for the MIME type of the data" +
                    "at the given URI"
        )
    }

    override fun insert(uri: Uri, values: ContentValues?): Uri? {
        TODO("Implement this to handle requests to insert a new row.")
    }

    override fun query(
        uri: Uri, projection: Array<String>?, selection: String?,
        selectionArgs: Array<String>?, sortOrder: String?
    ): Cursor? {
        TODO("Implement this to handle query requests from clients.")
    }

    override fun update(
        uri: Uri, values: ContentValues?, selection: String?,
        selectionArgs: Array<String>?
    ): Int {
        TODO("Implement this to handle requests to update one or more rows.")
    }
}