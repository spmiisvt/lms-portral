<script setup>
const props = defineProps({
  order: {
    type: Number,
    required: true
  },
  title: {
    type: String,
    required: true
  },
  content: {
    type: String,
    required: true
  }
})
</script>
<template>
  <div class="card">
    <div class="card-body">
      <h5 class="card-title">{{order}}. {{ title }}</h5>
      <span>{{ content }}</span>
    </div>
  </div>
</template>
