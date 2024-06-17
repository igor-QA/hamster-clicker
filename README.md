# hamster-clicker

### Настройки для запуска Hamster Clicker

- Установить android studio https://developer.android.com/studio

### Прописать настройки.
### Параметры Path:

##### Windows:
```
%ANDROID_HOME%\tools
```
```
%ANDROID_HOME%\tools\bin
```
```
%ANDROID_HOME%\platform-tools
```
- Одной строкой, можно скопировать и добавить в конец Path: 
```
%ANDROID_HOME%\tools;%ANDROID_HOME%\tools\bin;%ANDROID_HOME%\platform-tools
```

##### Mac:
```
export ANDROID_HOME=/Users/ipavlov/Library/Android/sdk
```
```
export PATH=$PATH:$ANDROID_HOME/tools:$ANDROID_HOME/platform-tools
```
```
source ~/.bash_profile
```

##### Дополнительно:
- Установить node.js - https://nodejs.org/en/download
- Установить Appium Server https://github.com/appium/appium
```
Sudo npm install -g appium@next
```
- Установить драйвер uiautomator2
```
sudo appium driver install --source=npm uiautomator2
``` 
- Если команда не подходит - можно выполнить эту:
```
appium driver install uiautomator2
```
- Установить Appium Ispector https://github.com/appium/appium-inspector

##### Запустить Appium Server

```
appium server --base-path /wd/hub
```
