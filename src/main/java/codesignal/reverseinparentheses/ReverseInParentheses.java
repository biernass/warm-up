package codesignal.reverseinparentheses;

public class ReverseInParentheses {

    public String reverseInParentheses(String inputString) {
        StringBuilder strBuilder = new StringBuilder();
        StringBuilder resultString = new StringBuilder();

        if (inputString.length() == 0)
            return "";
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == '(') {
                do {
                    if (inputString.charAt(i + 1) == ')') {
                        i++;
                        break;
                    } else if (inputString.charAt(i + 1) == '(') {
                        do {
                            if (inputString.charAt(i + 1) == ')') {
                                i++;
                                break;
                            }
                            if (inputString.charAt(i + 1) != ')') {
                                strBuilder.append(inputString.charAt(++i));
                            }
                        } while (inputString.charAt(i) != ')');
                        resultString.append(inputString.charAt(i));
                    }

                    if (inputString.charAt(i + 1) != ')') {
                        strBuilder.append(inputString.charAt(++i));
                    }
                } while (inputString.charAt(i) != ')');
                resultString.append(strBuilder.reverse());
                strBuilder.delete(0, strBuilder.length());
            } else {
                resultString.append(inputString.charAt(i));
            }
        }
        return resultString.toString();
    }
}
