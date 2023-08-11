int count = 0

for (int i = 1; i <= 100; i++) {
    if ((i % 7) == 0) {
        count++
    }
}

println('Số lượng các số chia hết cho 7 từ 1 đến 100 là: ' + count)