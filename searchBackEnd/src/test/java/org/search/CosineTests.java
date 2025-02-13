package org.search;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import search.ForwardIndex;
import search.PageGradingUtil;

/**
 * Unit tests for cosine similarity.
 */
class CosineTests {

    @Test
    void equalVectors() {
        // Create two vector with random positive double values;
        double[] vectorA = {0.1, 0.2, 0.3, 0.4, 0.5};
        double[] vectorB = {0.1, 0.2, 0.3, 0.4, 0.5};

        // The cosine similarity of two equal vectors should be 1.0
        // Replace the cosineSimilarity method with your implementation
        assertEquals(1.0, PageGradingUtil.cosineSimilarity(vectorA, vectorB));

        // and remove the following line

    }

    @Test
    void equalVectorsImproved() {
        // Create two vector with random positive double values;
        double[] vectorA = {0.1, 0.2, 0.3, 0.4, 0.5};
        double[] vectorB = {0.1, 0.2, 0.3, 0.4, 0.5};

        // The cosine similarity of two equal vectors should be 1.0
        // Replace the cosineSimilarity method with your implementation
        assertEquals(1.0, PageGradingUtil.cosineSimilarityImproved(ForwardIndex.normalize(vectorA), ForwardIndex.normalize(vectorB)));

        // and remove the following line

    }

    @Test
    void orthogonalVectors() {
        // Create two orthogonal vectors
        double[] vectorA = {1.0, 0.0, 0.0};
        double[] vectorB = {0.0, 1.0, 0.0};
        // The cosine similarity of two orthogonal vectors should be 0.0
        // Replace the cosineSimilarity method with your implementation
        assertEquals(0.0, PageGradingUtil.cosineSimilarity(vectorA, vectorB));

        // and remove the following line!

    }


    @Test
    void orthogonalVectorsImproved() {
        // Create two orthogonal vectors
        double[] vectorA = {1.0, 0.0, 0.0};
        double[] vectorB = {0.0, 1.0, 0.0};
        // The cosine similarity of two orthogonal vectors should be 0.0
        // Replace the cosineSimilarity method with your implementation
        assertEquals(0.0, PageGradingUtil.cosineSimilarityImproved(ForwardIndex.normalize(vectorA), ForwardIndex.normalize(vectorB)));

        // and remove the following line!

    }


    @Test
    void randomVectors() {
        // Create two random vectors
        double[] vectorA = {0.1, 0.2, 0.3, 0.4, 0.5};
        double[] vectorB = {0.5, 0.4, 0.3, 0.2, 0.1};
        // The cosine similarity of two random positive vectors should be between 0.0
        // and 1.0
        // Replace the cosineSimilarity method with your implementation
        assertTrue(PageGradingUtil.cosineSimilarity(vectorA, vectorB) > 0.0);
        assertTrue(PageGradingUtil.cosineSimilarity(vectorA, vectorB) < 1.0);

        // and remove the following line!

    }

    @Test
    void randomVectorsImproved() {
        // Create two random vectors
        double[] vectorA = {0.1, 0.2, 0.3, 0.4, 0.5};
        double[] vectorB = {0.5, 0.4, 0.3, 0.2, 0.1};
        // The cosine similarity of two random positive vectors should be between 0.0
        // and 1.0
        // Replace the cosineSimilarity method with your implementation
        assertTrue(PageGradingUtil.cosineSimilarityImproved(ForwardIndex.normalize(vectorA), ForwardIndex.normalize(vectorB)) > 0.0);
        assertTrue(PageGradingUtil.cosineSimilarityImproved(ForwardIndex.normalize(vectorA), ForwardIndex.normalize(vectorB)) < 1.0);

        // and remove the following line!

    }

    @Test
    void specificResults() {
        // Create two vectors with specific values
        double[] vectorA = {0.1, 0.2, 0.3, 0.4, 0.5};
        double[] vectorB = {0.5, 0.4, 0.3, 0.2, 0.1};
        // The cosine similarity of these vectors should be 0.7
        // Replace the cosineSimilarity method with your implementation
        assertTrue(Math.abs(PageGradingUtil.cosineSimilarity(vectorA, vectorB) - 0.6364) < 0.0001);

        // and remove the following line!

    }

    @Test
    void specificResultsImproved() {
        // Create two vectors with specific values
        double[] vectorA = {0.1, 0.2, 0.3, 0.4, 0.5};
        double[] vectorB = {0.5, 0.4, 0.3, 0.2, 0.1};
        // The cosine similarity of these vectors should be 0.7
        // Replace the cosineSimilarity method with your implementation
        assertTrue(Math.abs(PageGradingUtil.cosineSimilarityImproved(ForwardIndex.normalize(vectorA), ForwardIndex.normalize(vectorB)) - 0.6364) < 0.0001);

        // and remove the following line!

    }
}