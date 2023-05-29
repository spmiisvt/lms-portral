<script setup>
const props = defineProps({
  title: {
    type: String,
    required: true,
  },
  active: {
    type: Boolean,
    default: false
  }
})
</script>
<template>
  <li :class="['list-group-item', {'active': active}]">{{ title }}</li>
</template>

