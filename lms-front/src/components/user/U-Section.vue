<script setup>
const props = defineProps({
  title: {
    type: String,
    required: true,
  },
  content: {
    type: String,
    default: ""
  }
})
</script>
<template>
  <h5 class="card-title">{{ title }}</h5>
  <p v-html="content"></p>
</template>

