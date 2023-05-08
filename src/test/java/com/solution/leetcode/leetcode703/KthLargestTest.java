package com.solution.leetcode.leetcode703;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class KthLargestTest {

    @Test
    void test_newInstance() {
        KthLargest newInstance = new KthLargest(3, new int[]{4, 5, 8, 2});
        Assertions.assertThat(newInstance.q).hasSize(3);
        Assertions.assertThat(newInstance.q).contains(4, 5, 8);
    }

    @Test
    void add() {
        KthLargest newInstance = new KthLargest(3, new int[]{4, 5, 8, 2});
        Assertions.assertThat(newInstance.add(3)).isEqualTo(4);
        Assertions.assertThat(newInstance.add(5)).isEqualTo(5);
        Assertions.assertThat(newInstance.add(10)).isEqualTo(5);
        Assertions.assertThat(newInstance.add(9)).isEqualTo(8);
        Assertions.assertThat(newInstance.add(4)).isEqualTo(8);
    }
}