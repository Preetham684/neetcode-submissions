/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        //Make head point to the last node of the list
        ListNode *current = head;
        ListNode *after = nullptr;
        ListNode *before = nullptr;

        while(current != nullptr){
            //5->4->3->2->1
            after = current->next;
            current->next = before;
            before = current;
            current = after;

        }

        return before;
        
    }
};
