[![](https://jitpack.io/v/ankushyerawar/FloatingSnackBar.svg)](https://jitpack.io/#ankushyerawar/FloatingSnackBar) [![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

# FloatingSnackBar
Gmail Style Floating Snackbar with Custom Functionality.


# Prerequisites

Add this in your root `build.gradle` file (not your module `build.gradle` file) :

	allprojects {
			repositories {
				...
				maven { url 'https://jitpack.io' }
			}
		}
  
# Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

	dependencies {
			implementation 'com.google.android.material:material:1.2.0'
			implementation 'com.github.ankushyerawar:FloatingSnackBar:1.0.2'
		}
		
# Versions

**Version 0.1.0**

First Release.

**Version 1.0.0**

Added a New Functionality to add icon to Normal Snackbar.

**Version 1.0.1**

Now you can change Icons of Default SnackBar Methods like success, error by passing Resource Id.

**Version 1.0.2**

Some small changes and Error handling.

**Version 1.0.3**

Now supports material design librery 1.1.0 and 1.2.0.
All new featrue to support text RTL.

# Sneak Peek

![device-2019-12-12-104334](https://user-images.githubusercontent.com/47925684/70686013-083a4300-1cd1-11ea-9f5f-84b03bbe1258.gif)	

# Usage

Each method always returns a `Snackbar` object, so you can customize the `Snackbar` much more. **DON'T FORGET THE `show()` METHOD!**

To display an error Snackbar:
```
SnackBar.error(getView(),R.string.app_name, SnackBar.LENGTH_LONG).show();
```

To display a success Snackbar:
```
SnackBar.success(view, R.string.app_name, SnackBar.LENGTH_LONG).show();
```

To display an info Snackbar:
```
SnackBar.info(getView(),R.string.app_name, SnackBar.LENGTH_LONG).show();
```

To display a warning Snackbar:
```
SnackBar.warning(getView(),R.string.app_name, SnackBar.LENGTH_LONG).show();
```
To display the usual Snackbar:
```
SnackBar.normal(getView(),R.string.app_name, SnackBar.LENGTH_LONG).show();
```
To display the usual Snackbar with icon:
```
SnackBar.normal(getView(),"Snackbar with icon", SnackBar.LENGTH_LONG, R.drawable.ic_normal).show();
```
You can also create your custom Snackbar with the custom() method:
```
SnackBar.custom(view, R.string.app_name, SnackBar.LENGTH_LONG,R.drawable.ic_custom, Color.DKGRAY, Color.WHITE,true).show();
```
Here, This method also supports text rtl.

# Extra

**There are variants of each method, feel free to explore this library.**

# Pull Request

Have some new ideas or found a `bug`? Do not hesitate to open an `issue` and make a `pull request`.

# License

This library is under MIT License. See the [License](https://github.com/ankushyerawar/FloatingSnackBar/blob/master/LICENSE) file for more info.






