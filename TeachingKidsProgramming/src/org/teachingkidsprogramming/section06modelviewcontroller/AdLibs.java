package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class AdLibs
{
  public static void main(String[] args)
  {
    MessageBox.showMessage("This is a long one, so get ready.");
    String currentVerb = MessageBox.askForTextInput("Enter a past-tense verb.");
    //  Ask the user to enter an adverb, save it as currentAdverb --#2
    String currentAdverb = MessageBox.askForTextInput("Enter an adverb.");
    //  Ask the user to enter a verb ending in '-ed', save it as currentEdVerb --#4
    String currentEdVerb = MessageBox.askForTextInput("Enter a past-tense verb.");
    String currentPronoun = MessageBox.askForTextInput(
        "Enter a pronoun that goes with the past-tense verb.  For example: 'with', 'to', or 'at'.");
    //  Ask the user to enter a body part, save it as currentBodyPart --#6
    String currentBodyPart = MessageBox.askForTextInput("Enter a noun.");
    //  Set the value of the currentStory to the word "Today " --#1.2
    String currentStory = MessageBox.askForTextInput("Enter 'day' or 'night'.") + " ";
    String currentAdjective = MessageBox.askForTextInput("Enter an adjective.");
    String currentConjunction = MessageBox
        .askForTextInput("Enter a conjunction that goes with the adjective.  For example: 'my', 'a', or 'an'.");
    String currentThem = MessageBox
        .askForTextInput("Enter a person.  For example: 'she', 'he', 'I', 'they', or 'we'.");
    String currentThemV2 = MessageBox
        .askForTextInput("Enter a person.  For example: 'she', 'he', 'I', 'they', or 'we' again.  (Capitalized)");
    String currentEdVerbV2 = MessageBox.askForTextInput("Enter a past-tense verb.");
    String currentAdverbV2 = MessageBox.askForTextInput("Enter an adverb.");
    String currentMotion = MessageBox.askForTextInput("Enter a past-tense verb.");
    String currentPlace = MessageBox.askForTextInput("Enter a noun");
    String currentConjunctionV2 = MessageBox
        .askForTextInput("Enter a conjunction that goes with the adjective.  For example: 'my', 'a', or 'an'.");
    currentStory = "To" + currentStory;
    //  Add the words "I woke " + currentAdverb + ". " to the currentStory --#3
    currentStory = currentStory + currentThem + " " + currentVerb + " " + currentAdverb + ".  ";
    //  Add the words '"Then I " + currentEdVerb + " " to the currentStory --#5
    currentStory = currentStory + "Then " + currentThem + " " + currentEdVerb + " " + currentPronoun + " ";
    //  Add the words "my " + currentBodyPart + ". " to the current story --#7
    currentStory = currentStory + currentConjunction + " " + currentAdjective + " " + currentBodyPart + ".  ";
    currentStory = currentStory + currentThemV2 + " " + currentEdVerbV2 + " " + currentAdverbV2 + ", and "
        + currentMotion + " " + currentPronoun + " " + currentConjunctionV2 + " " + currentPlace + ".  The end.";
    //  Show the currentStory in a message box as a message --#1.1
    MessageBox.showMessage(currentStory);
  }
}