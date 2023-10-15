// Task 1: Reverse every word in a sentence
function reverseWordsInSentence(sentence) {
  const words = sentence.split(" ");
  const reversedWords = words.map((word) => reverseWord(word));
  return reversedWords.join(" ");
}

function reverseWord(word) {
  return word.split("").reverse().join("");
}

const inputSentence = "This is a sunny day";
const reversedSentence = reverseWordsInSentence(inputSentence);
console.log("Reversed Sentence: " + reversedSentence);

// Task 2: Perform sorting of an array in descending order
const numbers = [5, 2, 9, 1, 5, 6];
const sortedDescending = numbers.sort((a, b) => b - a);
console.log("Sorted Descending: " + sortedDescending);
