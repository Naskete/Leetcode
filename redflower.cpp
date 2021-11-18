// 链接：https://ac.nowcoder.com/acm/contest/21684/H
// 来源：牛客网

// 一天，小椒发现了一个特别的花园，那里的花连续的排成一行，并且只有红花和白花。小椒钟爱红花，他想知道在这个花园里最大连续红花的数量会不会达到或超过他心中期望的连续红花数。
// 第一行输入 n 和 t ，表示花的数量以及小椒心中期望的连续红花数。
// 第二行输入长度为 n 的01串。在这个01串中，‘0’表示白花，‘1’表示红花。
// (1<= t <= n <= 1000000)

#include <iostream>
#include <string>
using namespace std;

int main(){
    int n, m, len=0;
    char ch;
    cin>>n>>m;
    while(n--){
        cin>>ch;
        if(ch=='1'){
            len++;
            if(len>=m){
                cout<<"Yes"<<endl;
                return 0;
            }
        } else if(ch=='0'){
            len=0;
        }
    }
    cout<<"No"<<endl;
    return 0;
}