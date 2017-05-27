# LunarCalendar
日期转农历

## 例子和效果图
![](https://raw.githubusercontent.com/loonggg/LunarCalendar/master/image/Screenshot_2017-05-27-16-02-57-702.png)

## 使用方法
### Step 1. Add the JitPack repository to your build file 
```java
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

### Step 2. Add the dependency
```java
	dependencies {
	        compile 'com.github.loonggg:LunarCalendar:v1.0'
	}
```

### Step 3. Used in the code
```java
    //获取农历
    Log.i("农历", LunarCalendar.getLunarYearMonthDay(2017, 5, 27));
    //只获取农历的年份
    Log.i("农历", LunarCalendar.getLunarYear(2017, 5, 27, true));
    Log.i("农历", LunarCalendar.getLunarYear(2017, 5, 27, false));
    //只获取农历的月日
    Log.i("农历", LunarCalendar.getLunarMonthDay(2017, 5, 27));
    //只获取农历的生肖
    Log.i("农历", LunarCalendar.getLunarAnimal(2017, 5, 27));
```

### 公众号
欢迎大家关注我的微信公众号：非著名程序员（smart_android），更多好的原创文章均首发于微信订阅号：非著名程序员
![](https://raw.githubusercontent.com/loonggg/BlogImages/master/%E5%85%AC%E4%BC%97%E5%8F%B7%E4%BA%8C%E7%BB%B4%E7%A0%81/erweima.jpg)

# License
```xml
Copyright 2016 loonggg

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
