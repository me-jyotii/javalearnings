#include <iostream>
#include <stack>
using namespace std;
// #define n 100

// class Stack
// {
// private:
//     int* arr;
//     int top;
// public:
//     Stack() {
//         arr = new int[n];
//         top = -1;
//     }

//     void push(int num) {
//         if(top == n-1) {
//             cout<<"Stack Overflow"<<endl;
//             return;
//         }
//         top++;
//         arr[top] = num;
//     }

//     void pop() {
//         if(top == -1){
//             cout<<"Stack underflow"<<endl;
//             return;
//         }

//         top--;
//     }

//     int Top() {
//         if(top == -1){
//             cout<<"Stack underflow"<<endl;
//             return -1;
//         }

//         return arr[top];
//     }

//     bool isEmpty() {
//         return (top == -1);
//     }
// };


// int main() {

//     Stack st;
//     for(int i=1; i<=5; i++){
//         st.push(i);
//     }

//     for(int i=1; i<=5; i++){
//         cout<<st.Top()<<" ";
//     }

//     cout<<endl<<st.isEmpty()<<endl;

//     for(int i=1; i<=6; i++){
//         st.pop();
//     }

//     cout<<st.isEmpty()<<endl;  

// }

void insert_bottom(stack<int> &st, int ele) {
    if(st.empty()) {
        st.push(ele);
        return;
    }

    int topele = st.top();
    st.pop();
    insert_bottom(st , ele);
    st.push(topele);

}
void reverseStack(stack<int> &st) {

    if(st.empty()){
        return;
    }
    int ele = st.top();
    st.pop();
    reverseStack(st);
    insert_bottom(st,ele);
}
int main() {
    stack<int> st;
    for(int i=0; i<5; i++){
        st.push(i);
    }
    reverseStack(st);
    for(int i=0; i<5; i++){
        cout<<st.top();
        st.pop();
    }

}