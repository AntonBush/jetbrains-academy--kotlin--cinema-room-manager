fun printFifthCharacter(input: String): String {
    if (input.length < 5) {
        return "The input word is too short!"
    }
    return "The fifth character of the entered word is ${input[4]}"
}