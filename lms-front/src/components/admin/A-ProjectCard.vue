<script setup>
import {RouterLink} from "vue-router";

const props = defineProps({
  id: {
    type: Number,
    required: true
  },
  title: {
    type: String,
    required: true
  },
  description: {
    type: String,
    required: true
  }
})
</script>

<template>
  <div class="col-lg-6">
    <div class="card">
      <div class="card-header">Количество этапов: 5</div>
      <div class="card-body">
        <h5 class="card-title">{{title}}</h5>
        {{description}}
      </div>
      <div class="card-footer">
        <router-link :to="{name: 'Project', params: {id: id}}" class="btn btn-outline-dark">Редактировать</router-link>
      </div>
    </div><!-- End Card with header and footer -->
  </div>
</template>
