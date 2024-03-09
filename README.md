# NoMoreBlur (Fabric)

This mod does one thing: skip rendering menu's blur effect when the blurriness is 0%,
which significantly increases the game's frame rate in menu screens.

## Why Use It?
In vanilla, the blur effect will **still** render when the blurriness is 0%,
and it's really **unfriendly** to low-end devices.

## Requirements

Only Minecraft 24w10a (or higher versions) is required.

## Compiling

JDK 17 or higher is required.

On Unix-like Systems, run:

```shell
chmod +x gradlew
./gradlew build
```

On Windows, simply run:

```batch
gradlew build
```

And the output jar is at: `build/libs`

## License

This mod is licensed under MIT License, see [LICENSE](/LICENSE) for more information.