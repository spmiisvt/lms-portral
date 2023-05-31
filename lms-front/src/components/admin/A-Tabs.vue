<script setup>
import {ref} from "vue";

const props = defineProps({
  stages: {
    type: Array
  },
  title: {
    type: String,
    default: "Стадии"
  }
})
const currentTab = ref(1);
</script>

<template>
  <div class="card">
    <div class="card-body">
      <h5 class="card-title">{{title}}</h5>
      <ul class="nav nav-tabs d-flex" role="tablist">
        <li v-for="stage in stages" :key="stage.order" class="nav-item flex-fill" role="presentation">
          <button
              @click.prevent="currentTab = stage.order"
              :class="['nav-link w-100', {'active': currentTab === stage.order}]"
              id="home-tab"
              >{{stage.title}}</button>
        </li>

      </ul>
      <div class="tab-content pt-2">
        <div
            v-for="stage in stages" :key="stage.order"
            :class="['tab-pane fade', {'show active': stage.order === currentTab}]"
            >
            {{stage.description}}
        </div>

      </div>

    </div>
  </div>
</template>
