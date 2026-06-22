class Solution {

    int b = 0, l = 0, a = 0, o = 0, n = 0;

    public void characterCount(char c) {
        if (c == 'b') {
            b++;
        } else if (c == 'a') {
            a++;
        } else if (c == 'l') {
            l++;
        } else if (c == 'o') {
            o++;
        } else if (c == 'n') {
            n++;
        }
    }

    public int maxNumberOfBalloons(String text) {
        for (int i = 0; i < text.length(); i++) {
            characterCount(text.charAt(i));
        }

        return Math.min(
                Math.min(b, a),
                Math.min(l / 2, Math.min(o / 2, n)));
    }
}