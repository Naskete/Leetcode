#include<iostream>
using namespace std;

struct ListNode{
    int val;
    ListNode* next;
    ListNode(int x): val(x), next(NULL){}
};

bool hasCycle(ListNode *head){
    if(!head||!head->next) return false;
        ListNode* p = head, *q = head;
        while(p->next&&q->next){
            p=p->next;
            if(!q->next->next){
                return false;
            }
            q=q->next->next;
            if(p==q){
                return true;
            }
        }
        return false;
}

int main(){
    return 0;
}