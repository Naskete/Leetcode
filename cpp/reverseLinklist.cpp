#include <iostream>

struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

ListNode* reverseList(ListNode* head) {
    ListNode* temp = NULL, *newhead = NULL;
    while(head){
        temp = head;
        head = temp->next;
        temp->next = newhead;
        newhead = temp;
    }
    return newhead;
    };