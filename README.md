# Spring kickstart template
Code template created for rapid Application start and deployment

Uses spring boot-strap with development tools for quick kickstart.

### build

```
# gradle assemble
# gradlew assemble (or for windows)
```

### run

```
# gradle runBoot
# gradlew runBoot (or for windows)

```

### Cloud Foundry Support (hosted on Pivotal Web Services)
First it is required to set up cloud foundry account on https://run.pivotal.io

Then create file gradle.properties with your credentials as follows:

```
cfUsername=your_email_or_username
cfPassword=pass
cfApp=app-name
```

## Mobile support
To add mobile support type there is script for bower, just type in console:

```
# bower install jquery-mobile-bower --save
```

## Using development tools
New spring-boot comes with development tools, improving faster redeploy.
You App will automatically restart whenever files on the classpath change

For static files, just change the file (ie. html file) and sacve it (eclipse, netbeans).For Intellij use make Project command

###Other useful links:

http://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/#using-boot-devtools

https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-1.3-Release-Notes