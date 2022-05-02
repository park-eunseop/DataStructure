package com.company.heap;

/**
 * 힙(Heap) 이란?
 * 힙: 데이터에서 최대값과 최소값을 빠르게 찾기 위해 고안된 완전 이진 트리
 * 완전 이진 트리: 노드를 삽입할 때 최하단 왼쪽 노드부터 차례대로 삽입하는 트리
 * 어떻게 동작하는 자료 구조인지 알고 있어야한다.
 * 시간복잡도가 O(n) 에비해 O(log n) 이 걸린다.
 * 이진 탐색 트리: 왼쪽 자식 노드 값이 가장 작고, 그 다음 부모 노드, 그 다음 오른쪽 노드 (검색을 위한 구조)
 * 힙: 조건이 없음 (최대, 최소값을 구하기 위한 구조)
 * Max Heap : 각 노드의 값은 해당 노드의 자식 노드가 가진 값보다 크거나 같다.
 * Min Heap : 각 노드의 값은 해당 노드의 자식 노드가 가진 값보다 작거나 같다.
 *
 * 빅오 표기법에서 log n 에서의 log 밑은 10이 아니라 2입니다.
 */
public class HeapMain {
    public static void main(String[] args) {
        MyHeap heap = new MyHeap(15);
        heap.insert(10);
        heap.insert(8);
        heap.insert(5);
        heap.insert(4);
        heap.insert(20);

        System.out.println(heap.heapArray);
        System.out.println(heap.pop());
        System.out.println(heap.heapArray);
    }
}
