class Solution {
public:
    bool isValid(string s) {

        int m = s.length();
        char arr[m];
        int top = -1;

        for (int i = 0; i < s.length(); i++) {

            char ch = s[i];

            if (ch == '(' || ch == '{' || ch == '[') {
                arr[++top] = ch;
            }

            else {

                if (top == -1)
                    return false;

                if (ch == ')' && arr[top] == '(')
                    top--;

                else if (ch == '}' && arr[top] == '{')
                    top--;

                else if (ch == ']' && arr[top] == '[')
                    top--;

                
            }
        }
        return top == -1;

        
    }
};
