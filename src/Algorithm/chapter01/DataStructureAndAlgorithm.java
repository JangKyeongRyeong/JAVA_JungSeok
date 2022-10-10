package Algorithm.chapter01;
/**
 * 자료구조와 알고리즘
 *
 * 자료구조란?
 * 효율적으로 데이터를 저장하고 데이터 간의 관계를 정의할 수 있으며, 각 데이터의 접근과 수정 및 삭제 등 관리에 용이함.
 *
 * 자료구조의 종류
 * 1. 선형 구조 : 데이터를 일렬로 나열한 형태
 * 2. 비선형 구조 : 데이터를 계층 구조화한 형태이고 인접한 요소들 간에 다수의 요소들이 존재함.
 *
 *
 * 알고리즘이란?
 * 주어진 문제를 해결하기위한 일련의 과정 및 논리적인 절차
 *
 */
public class DataStructureAndAlgorithm {
    public static void main(String[] args) {
        int data1 = 3;
        int data2 = 1;
        int data3 = 9;
        int data4 = 5;
        int data5 = 10;

        int min = data1;

        if(data2<min){
            min = data2;
        }

        if(data3<min){
            min=data3;
        }

        if(data4<min){
            min=data4;
        }

        if(data5<min){
            min=data5;
        }

        System.out.println("최솟값: "+ min);
    }
}
