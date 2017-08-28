CoreX
===================

Introduction
-------------

CoreX is nuclear-powered server software for Minecraft: Pocket Edition.
It has a few key advantages over other server software:

* Written in Java, CoreX is faster and more stable.
* Having a friendly structure, it's easy to contribute to CoreX's development and rewrite plugins from other platforms into Nukkit plugins.

CoreX is **under improvement** yet, we welcome contributions. 

We're on Discord
-----------------
https://discord.gg/gF4xtVh

Build JAR file
-------------
- `git submodule update --init`
- `mvn clean`
- `mvn package`

Running
-------------
Simply run `start.sh` or `start.cmd`, or execute `java -jar CoreX.jar`.

Plugin API
-------------
#### **Example Plugin**
Example Plugin which shows the API of Nukkit.

* __[Example Plugin](http://github.com/Nukkit/ExamplePlugin)__

Development Tools
-----------------
There're some tools for Nukkit developers.

* __[FDevTools](https://github.com/fengberd/FDevTools)__ (**Load source and pack them easily**)
* __[PocketServer](https://github.com/fengberd/MinecraftPEServer)__ (**Run Nukkit on android devices**)
