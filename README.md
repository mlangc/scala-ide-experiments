# Scala-IDE Experiments
*Repository for illustrating bugs, features and modifications of Scala-IDE and related projects*

## Usage
Run "Organize Imports" on `com.github.mlangc.experiments.Bug` and witness how the IDE breaks our code.
The related ticket can be found [here](https://github.com/scala-ide/scala-refactoring/issues/73).

## Note
I originally believed that this bug is related specifically to type aliases; this however is not the case.
What's relevant is that the class that needs to be imported is defined in the same file.