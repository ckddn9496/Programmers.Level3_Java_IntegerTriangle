# Programmers.Level3_Java_IntegerTriangle
Programmers DP Level3_IntegerTriangle 정수삼각형

피라미드 형태의 숫자 배열이 input으로 들어오면(int[][]), 피라미드 꼭대기의 숫자부터 바닥까지 숫자를 거치며 내려온다고 할때 거쳐온 숫자의 합중 최대값을 return하는 문제.

피라미드의 각 열에 대한 합을 구할때 참조하는 저장공간은 계산된 이전의 열을 참조해야 하므로 별도의 저장공간이 없이 들어온 input배열만으로 바닥열의 합을 구할 수 있다.
