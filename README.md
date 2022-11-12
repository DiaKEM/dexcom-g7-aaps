# AndroidAPS compatible with Dexcom G7

This AndroidAPS variant is designed to work with the Dexcom G7 over direct broadcasting by 
[Dexcom G7 APK Patcher](https://github.com/DiaKEM/dexcom-g7-apk-patcher)

## Smoothing 

Dexcom has removed data smoothing from G6 actively and announced that [here](https://www.dexcom.
com/en-us/faqs/why-does-past-cgm-data-look-different-from-past-data-on-receiver-and-follow-app).
For G7 they simply not introduced it so that data in the app can look very weird in some situations.

To overcome this problem this branch is using `backward smoothing` implemented by @justmara.
You can check all changes [here](https://github.com/justmara/AndroidAPS/commits/wip/smoothed).

## How to use?

1. Create your patched `Dexcom G7.apk`

To enable broadcasting you have to build your patched `Dexcom G7 .apk` first. Please visit 
[Dexcom G7 APK Patcher](https://github.com/DiaKEM/dexcom-g7-apk-patcher) and follow the 
instructions at [How to patch?](https://github.com/DiaKEM/dexcom-g7-apk-patcher#how-to-patch).

2. Checkout this repository and build and sign it

Nothing to mention here. Just checkout out and build `master`. Do not forget to use your usual 
`keystore` for signing the `.apk`.

3. Install patched `Dexcom G7.apk`

> :warning: If you are **switching** from the stock `.apk` to the patched one you will 
> have to configure and restart your sensor. Further updates will not require this procedure 
> anymore.

* Uninstall stock `.apk` over the PlayStore
* Transfer patched `.apk` to your device and install it

4. Install AndroidAPS

> :warning: Please ensure that you have signed the newly builded AndroidAPS `.apk` with the same 
> `keystore` you have also used for the currently installed version.

* Transfer the newly builded AndroidAAPS to your phone
* Install it as usual

5. Configure BG-Source in AndroidAAPS

* Select good old `BYODA` as BG-Source

6. Enjoy!

It's done - enjoy it but be careful. If you facing any problems create an issue in [Dexcom G7 
APK Patcher repo](https://github.com/DiaKEM/dexcom-g7-apk-patcher).

## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create.
Any contributions you make are greatly appreciated.

If you have a suggestion that would make this better, please fork the repo and create a pull request.
You can also simply open an issue with the tag "enhancement". Don't forget to give the project a star! Thanks again!

* Fork the Project
* Create your Feature Branch (git checkout -b feature/AmazingFeature)
* Commit your Changes (git commit -m 'Add some AmazingFeature')
* Push to the Branch (git push origin feature/AmazingFeature)
* Open a Pull Request

## License

See AndroidAPS

## Contact

Selcuk Kekec

E-mail: [khskekec@gmail.com](khskekec@gmail.com)