# Spring kickstart template
## created for rapid Application start and deployment
## Uses spring boot-strap with development tools for quick kick off

## build

```
# gradle assemble

```
or (for windows)
```

# gradlew assemble
```

## run

```
# gradle runBoot

```
or (for windows)
```

# gradlew runBoot
```

## Cloud Foundry Support
### hosted on Pivotal Web Services
First it is required to set up cloud foundry account on https://run.pivotal.io
then create file gradle.properties with your credentials as follows:

```
cfUsername=your_email_or_username
cfPassword=pass
cfApp=app-name
```

## Mobile support
To add mobile support type there is script for bower,
Just type in console:

```
# bower install jquery-mobile-bower --save
```

## Using development tools
#new spring-boot comes with development tools, improving faster redeploy
For static files, just change the file (ie. html file) and sacve it (eclipse, netbeans)
For Intellij use make Project command
