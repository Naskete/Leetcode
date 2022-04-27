#include <bits/stdc++.h>
using namespace std;

#define ll long long

int n;
ll p, q;
ll a = 0, b = 1, c = 1;
const int mod = 1e9+7;

int gcd(ll x, ll y) {
    int z;
    while (y != 0) {
        z = x % y;
        x = y;
        y = z;
    }
    return x;
}

void qsortN(int n) {
    if (n <= 1) {
        a = 0, b = 0, c = 0;
    } else if (n == 2) {
        a = 0, b = 1, c = 1;
    } else {
        a = 0, b = 1, c = 1;
        for (int i = 2; i < n; i++) {
            p = (c * (i + 1)) % mod;                      // 分母
            q = (b * (i + 1) + a * c + b - 2 * c) % mod;  // 分子
            int r = gcd(p, q);
            p = p / r, q = q / r;
            // 计算
            a = a + 2 + q / p;
            b = q % p;
            c = p;
        }
    }
    cout << a << " " << b << " " << c<<endl;
}

// int main() {
//     for(int i = 0; i < 1000; i++){
//         qsortN(i);
//     }
// }

// T(N) = {
//  T(1) = 0
//  T(N) = (N+1)/N*T(N-1) - 2/N + 2
//}

// T(1) = 0; T(2) = 0+1/1; T(3) = 2+2/3; T(4) = ; T(5) = 7 + 2/5;
// T(N) = a + 2 + (c*N + ab + c - 2b) / bN

// float qsortN(int n) {
//     if (n == 1) {
//         return 0;
//     } else if (n == 2) {
//         return 1;
//     } else {
//         return 1.0*(n+1)/n*qsortN(n-1) - 2/n + 2;
//     }
// }

// int gcdR(int x, int y){
//     if(y==0){
//         return x;
//     } else {
//         return gcdR(y, x%y);
//     }
// }