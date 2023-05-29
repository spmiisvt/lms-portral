<script setup>
const props = defineProps({
  title: {
    type: String,
    default: "",
  },
  stages: {
    required: true
  }
})

</script>

<style scoped>

</style>

<template>
  <aside id="sidebar" class="sidebar">
    <ul class="sidebar-nav" id="sidebar-nav">
      <li class="nav-item">
        <a class="nav-link " href="#">
          <i class="bi bi-grid"></i>
          <span>{{ title }}</span>
        </a>
      </li>
      <li class="nav-item" v-for="stage in stages" :key="stage.id">
        <a class="nav-link collapsed" :data-bs-target="'#' + [stage.slug]+'-nav'" data-bs-toggle="collapse" href="#">
          <i class="bi bi-menu-button-wide"></i><span>{{stage.title}}</span><i class="bi bi-chevron-down ms-auto"></i>
        </a>
        <ul :id="[ stage.slug ] + '-nav'" class="nav-content collapse " data-bs-parent="#sidebar-nav">
          <li v-for="lecture in stage.lectures" :key="stage.id">
            <router-link :to="{ name:'Course', params: {lecture_slug: lecture.slug}}">
              <i class="bi bi-circle"></i><span>{{lecture.title}}</span>
            </router-link>
          </li>
        </ul>
      </li>
    </ul>
  </aside>
</template>

