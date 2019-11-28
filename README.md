[![](https://jitpack.io/v/ankushyerawar/FloatingSnackBar.svg)](https://jitpack.io/#ankushyerawar/FloatingSnackBar)

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
			implementation 'com.google.android.material:material:1.0.0'
			implementation 'com.github.ankushyerawar:FloatingSnackBar:0.1.0'
		}
		

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
SnackBar.normal(getView(),"Snackbar without icon", SnackBar.LENGTH_LONG).show();
```
You can also create your custom Snackbar with the custom() method:
```
SnackBar.custom(view, R.string.app_name, SnackBar.LENGTH_LONG, R.drawable.ic_custom, Color.DKGRAY, Color.WHITE).show();
```
