#include <iostream>

struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

ListNode* getPerious(ListNode* head, ListNode* cur){
    ListNode* p = head;
    while(p->next){
        if(p->next == cur){
            break;
        }
        p = p->next;
    }
    return p;
}

bool isPalindrome(ListNode* head) {
    if(head==NULL || head->next == NULL) return true;
    ListNode* p = head, *q = head;
    while(p->next){
        p=p->next;
    }
    while(p!=q){
        if(p->val!=q->val) return false;
        if(q->next==p) break;
        p=getPerious(head, p);
        q=q->next;
        
    }
    return true;
}