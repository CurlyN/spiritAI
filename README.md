In order to run project locally: ./gradlew bootRun
For creating a Docker image please type: docker build --build-arg VERSION=0.0.1-SNAPSHOT -t spiritai
--build-arg - is an optional parameter as it has a default software version. This parameter is used for passing a new version
-t spiritai - is an option to specify name for an image in order to find it quickly 

## Langages
Tasks' implementation is using Kotlin and Java

## WebApi 
There are two endpoints:
1)POST /calculate  for Roman Calculator. Please, specify expression that you would like to calculate in the body
2) GET /runFizzBuzz will return 100 processed words as mentioned in the task