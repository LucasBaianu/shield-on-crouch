# Shield on Crouch

A client-side Fabric mod for Minecraft 26.3 that automatically raises your shield while you crouch.

## How to use

1. Hold a shield in your **off-hand**.
2. Hold **Shift** (crouch). The shield goes up.
3. Release Shift. The shield goes down.

## Requirements

- Minecraft 26.3
- [Fabric Loader](https://fabricmc.net/use/installer/)
- [Fabric API](https://modrinth.com/mod/fabric-api)
- Java 25

The mod is client-side only. You don't need to install it on the server.

## Installation

1. Install Fabric Loader for Minecraft 26.3.
2. Download the latest `.jar` from the [Releases](../../releases) page.
3. Put it, together with Fabric API, in your `mods` folder.

## Notes

- The mod simulates holding the "use item" button while you crouch, so it may also interact with whatever you are looking at (chests, doors, etc.).
- Some servers may consider input automation unfair. Check your server's rules before using it.

## Building from source

```bash
./gradlew build
```

The jar is generated in `build/libs/`.

## License

This project is licensed under the [MIT License](LICENSE).

---

## Português

Mod Fabric (somente cliente) que levanta o escudo automaticamente enquanto você agacha.
