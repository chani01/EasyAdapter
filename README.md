# EasyAdapter
Recycler View easy adpater

## SetUp
![Build Status](https://img.shields.io/badge/download-1.0.1-green.svg)

```
allprojects {
	repositories {
		maven { url 'https://jitpack.io' }
	}
}
```

### android x
```
dependencies {
    implementation "androidx.recyclerview:recyclerview:x.y.z"
    implementation 'com.github.chani01:EasyAdapter:1.0.1'
}
```

## How to use

### Base
```
val adapter = object : EasyAdapter<Any>() {
            override fun getLayoutId(position: Int, obj: Any): Int {
                return R.layout.your_item_view
            }

            override fun getViewHolder(view: View, viewType: Int): RecyclerView.ViewHolder {
                return YourViewHolder(view)
            }
        }
```

### Use
```
val list = mutableListOf("apple", "banana", "orange")
val adapter = object : EasyAdapter<String>() {
            override fun getLayoutId(position: Int, obj: String): Int {
                return R.layout.your_item_view
            }

            override fun getViewHolder(view: View, viewType: Int): RecyclerView.ViewHolder {
                return YourViewHolder(view)
            }
        }
        adapter.setItems(list)
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = adapter
        
```
 
 #### YourViewHolder Class
 ```
 class YourViewHolder(itemView: View) : EasyViewHolder(itemView), EasyAdapter.Binder<String> {
    override fun bind(data: String, adapter: EasyAdapter<String>) {
        itemView.textView.text = data
    }
 }
 ```
 
## method
EasyAdpater supports the methods.
* ```selectPosition : choice position (default : 0)```
* ```recycler adpater mathod```

## License
```
Copyright 2020 chani

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
