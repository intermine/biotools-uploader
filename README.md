# biotools-uploader
It allows to add to https://bio.tools all the intermine instances registered in registry.intermine.org.
Clone the project from github and execute
```
./gradlew run  --args='{API token}'
```
or 
```
./gradlew run  --args='{API token} FlyMine'
```
if you want to add a specific instance

To generate Java Objects from JSON (FlyMine json) we have used http://www.jsonschema2pojo.org/
