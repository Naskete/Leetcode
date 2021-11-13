#include <iostream>
using namespace std;

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

// no timeout
bool isPalindromeII(ListNode* head) {
    if(head==NULL || head->next == NULL) return true;
    ListNode* p = head;
    string s;
    while(p){
        s+=to_string(p->val);
        p=p->next;
    }
    int len = s.length();
    for(int i = 0; i < len; i++){
        if(s[i]!=s[len-i-1]){
            return false;
        }
        if(i>=len-i-1)
            break;
    }
    return true;
}