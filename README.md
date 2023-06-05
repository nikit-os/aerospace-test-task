In this example, we have a media player component which playback video content (probably something to popular web-based apps or streaming providers). 
Initially, the player has no content (null state) and then starts the playback. Playback can be paused un-paused stopped, etc. 
Logically, some state transitions can only be considered valid when the current state has a set value. For instance, we cannot pause playback when the content is not playing. 
Also, we can only have a buffering state if the player is currently playing back content.

## Requirements
We have the following valid state transitions:
 - Null -> Playing
 - Stopped -> Playing
 - Paused -> Paying
 - Playing -> Buffering
 - Buffering -> Playing
 - Paused -> Stopped

## Program
 - Write a program which simulates playback events
 - Build a random generator module which outputs the following states: Stopped, Playing, Paused, Playing
 - The program is initialized with the null state
 - Track and validate current state using the above requirements
 - If a sate transitions cannot be performed, the action is rejected. This error should be logged, but the program should continue to run.

## How to build/run

*Requires Java 20*

```shell
mvn clean package
java -jar target/aerospace-test-task-jar-with-dependencies.jar
```