#include <iostream>
#include <time.h>
using namespace std;

int main(){
    float sec = 0.1;
    long s,n = 1000;
    clock_t start, end;
    while(1){
        start = clock();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                s=s+i+j;
            }
        }
        end = clock();
        double t = (double)(end-start)/CLOCKS_PER_SEC;
        if(t<sec){
            if(sec > 1){
                n+=10000;
            } else {
                n+=100;
            }
        } else {
            cout<<"n值："<<n<<endl;
            cout<<"用时:"<<t<<"s"<<endl;
            if(sec==10) break;
            sec*=10;
        }
    }
    return 0;
}